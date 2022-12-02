package com.example.demo.mapper;

import com.example.demo.pojo.FarmerRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FarmerRankDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public FarmerRankDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<FarmerRank> list(){
        String sql = "select t.farmer_id, row_number() over (partition by t.farmer_id) as rank_1, t.product_name, t.product_price, t.sum1\n" +
                "from (\n" +
                "select f.farmer_id, p2.product_id, p.product_name, p2.sum1, p.product_price\n" +
                "from Farmer f natural join Product p natural join (\n" +
                "select product_id, sum(quantity) as sum1\n" +
                "from Contains\n" +
                "group by product_id) as p2)t";
        List<FarmerRank> listFarmerRank = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(FarmerRank.class));
//        System.out.println(listFarmerRank);
        return listFarmerRank;
    }
}

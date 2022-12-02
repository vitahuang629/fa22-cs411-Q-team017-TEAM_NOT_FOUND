console.log('start');
$("#table1").on('input', '.u-cart-product-quantity', function () {
    console.log('in');
    var self = $(this);
    var tr = self.closest("tr");

    var quantity = self.val();
    console.log(quantity);
    var Price = tr.find(".u-cart-product-price").val();
    console.log(Price);

    var amount = 0
    if ($.isNumeric(quantity) && $.isNumeric(Price)) {
        amount = quantity * Price;
    }
    tr.find(".u-cart-product-subtotal").val(amount);
    
    // CalcSum();
});
// $("#table1").on('input', '.txtPrice', function () {
//     var self = $(this);
//     var tr = self.closest("tr");

//     var quantity = tr.find(".txtQuantity").val();
//     var Price = self.val();

//     var amount = 0
//     if ($.isNumeric(quantity) && $.isNumeric(Price)) {
//         amount = quantity * Price;
//     }            
//     tr.find(".txtAmount").val(amount);

//     // calcSum();
// });
// function saveUn(event) {
//     var username = document.getElementsByClassName('u-quantity-input');
    
//     alert(username);
//     event.preventDefault();
//   }
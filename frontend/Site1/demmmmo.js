function showPages(id){


    var totalNumberOfPages = 5;
    for(var i=1; i<=totalNumberOfPages; i++){

        if (document.getElementById('page'+i)) {

            document.getElementById('page'+i).style.display='none';
        }

    }
        if (document.getElementById('page'+id)) {

            document.getElementById('page'+id).style.display='block';
        }
};
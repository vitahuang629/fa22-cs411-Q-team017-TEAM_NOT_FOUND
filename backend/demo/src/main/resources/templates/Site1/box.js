function saveUn(event) {
  var username = document.getElementById('un').value;
  // alert(username);
  // var url = "http://localhost:8080/order/getOrder/" + username;
  var url = "http://localhost:8080/search?name="+username;
  // window.navigate(url);
  window.location.replace(url);
  event.preventDefault();
  }
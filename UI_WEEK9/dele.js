<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8 />
<title>JS Bin</title>
</head>
<body>
<ul>
<li> 빨강 </li>
<li> 주황 </li>
<li> 노랑 </li>
<li> 초록 </li>
<li> 파랑 </li>
<li> 남색 </li>
<li> 보라 </li>
</ul>  

<script>	

function handler(e) {
  alert(e.target.innerText);
}

function addEventHandler(ulElement) {
  ulElement.addEventListener('click' , handler , false);
}

var ulElement = document.getElementsByTagName('ul');
addEventHandler(ulElement);
</script>

</body>


</html>
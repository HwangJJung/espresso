1.

function findListClassName() {
	var nlist = document.getElementsByTagName("li");
	for ( var i =0 ; i < nlist.length; i ++ ) {
 	 console.log(nlist[i].className);
	}
}


2.

function DontHaveClassQuantity() {
	var allEle = document.querySelectorAll ("*");
	var count=0;
	for ( var i =0 ; i < allEle.length; i ++ ) {
	  if (ele[i].className === ""){
			count += 1;
	  }
	}
	console.log(count);
}

3.
window.addEventListener('click' , headerConsoleLog , 'false');
function headerConsoleLog(e) {
	if (e.pageY < 60)
	console.log("header 영역입니다.");
}

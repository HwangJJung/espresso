
var el = document.getElementById('swipable');
swipeDetect(el, function(swipedir){
 
	 var point = el.scrollTop;
	 if (swipedir === 'left'){
	 	
	 	if (point < 1020) {
	 	el.scrollTop = point + 255;
	 	}
	 }
	 else if (swipedir ==='right'){
	 	if (point > 0) {
	 	el.scrollTop = point - 255;
	 	}
	 }
	   
});

function swipeDetect(el, callback){
 
 var touchsurface = el,
 swipedir,
 startX,
 startY,
 distX,
 distY,
 threshold = 150, 
 restraint = 100, 
 allowedTime = 600, 
 elapsedTime,
 startTime,
 handleswipe = callback || function(swipedir){};
 
 touchsurface.addEventListener('touchstart', function(e){
  var touchobj = e.changedTouches[0];
  swipedir = 'none';
  dist = 0;
  startX = touchobj.pageX;
  startY = touchobj.pageY;
  startTime = new Date().getTime();
  e.preventDefault();
 
 }, false);
 
 touchsurface.addEventListener('touchmove', function(e){
    		e.preventDefault();
 }, false);
 
 touchsurface.addEventListener('touchend', function(e){
  var touchobj = e.changedTouches[0];
  distX = touchobj.pageX - startX; 
  distY = touchobj.pageY - startY;
  elapsedTime = new Date().getTime() - startTime ;
  if (elapsedTime <= allowedTime){ 
   if (Math.abs(distX) >= threshold && Math.abs(distY) <= restraint){ 
    swipedir = (distX < 0)? 'left' : 'right'; 
   }
   else if (Math.abs(distY) >= threshold && Math.abs(distX) <= restraint){ 
    swipedir = (distY < 0)? 'up' : 'down'; 
   }
  }
  handleswipe(swipedir);
  e.preventDefault();
 }, false);
};
 


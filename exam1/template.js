   window.addEventListener('load', function() {
               genreBtnClick();
               titleAndMoreBtnClick();
              	logoRefresh();
                googleMenuBtnClick();
                mobileReaction();
                }, false);



   	function mobileReaction() {
   		var smartPhones = [
		'iphone', 'ipod' , 'windows ce',
		'android' , 'blackberry' , 'nokia' , 
		'webos' , 'opera mini' , 'sonyerricsson' ,
		'opera mobi' , 'iemobile'
		];

		for (var i in smartPhones) {
		//스마트폰 확인

			if (navigator.userAgent.toLowerCase().match( new RegExp(smartPhones[i]))) {
				var movie_set_1 = document.getElementById('movie_set_1');
                movie_set_1.style.overflowX = 'scroll';
                movie_set_1.style.overflowY = 'hidden';
                
				var movie_ul_1 = document.getElementById('movie_ul_1');
				movie_ul_1.style.width = '1700px';
                
			}
		}
   	}

    function logoRefresh() {

    	var handler = function () {
    		window.location.reload(true);
    	};

   		var logo = document.querySelectorAll('.logo_image');
   		logo[0].addEventListener('click', handler, false);
       
        logo[1].addEventListener('click', handler, false);
            
   	}

   	function googleMenuBtnClick() {
   		var google_menu_btn = document.getElementById('google_menu_btn');
   		google_menu_btn.addEventListener('click', showDropDown , false);

   	}

	function titleAndMoreBtnClick(){
		
		var title_and_more_btn = document.querySelector('.set_title');
		title_and_more_btn.onclick = function() {
			return false;
		};
		title_and_more_btn.addEventListener('click', showMoreContent, false);

	}

	function showMoreContent(e) {
		
		loadMoreContent();
		var card_set = document.getElementById('movie_set_1');
		card_set.style.maxHeight = '100%';

		var movie_card_set = document.getElementById('movie_ul_1');
		movie_card_set.style.height= 'auto';
		movie_card_set.style.overflow = 'visible'; 

		var parent = e.target.parentNode;
		replaceDOMWeWant(parent);
		e.currentTarget.children[2].innerText = "업데이트 되었습니다 !";
		e.currentTarget.removeChild(e.currentTarget.children[1]);

		var title_and_more_btn = document.querySelector('.set_title');
		title_and_more_btn.removeEventListener('click', showMoreContent, false);


        card_set.style.overflowX = 'hidden';
        card_set.style.overflowY = 'hidden';
        
        
        movie_card_set.style.width = '100%';

	}	

	function replaceDOMWeWant(parent) {
		
		var body_container = document.getElementById('body_container');
		var footer = body_container.children[5];
		var elBrowsePage = document.createElement('div');
		var elSetContainer1 = document.createElement('div');
		var elSetContainer2 = document.createElement('div');

		elSetContainer1.className = 'set_container';
		elSetContainer2.className = 'set_container';
		elBrowsePage.className = 'browse_page';
		elSetContainer1.style.height = '0px';
		

		elSetContainer2.appendChild(parent.parentNode);
		elBrowsePage.appendChild(elSetContainer1);
		elBrowsePage.appendChild(elSetContainer2);

		
		body_container.innerHTML = "" ;
		body_container.appendChild(elBrowsePage);
		
		var elClear = document.createElement('div');
		elClear.style.clear ='both';
		
		body_container.appendChild(elClear);
		body_container.appendChild(footer);

	}
	function loadMoreContent() {
		loadBooks(function(sBooks) {
                 var movie_card_set = document.getElementById('movie_ul_1');
                 movie_card_set.innerHTML += sBooks;
                 DelateDataLoadingPage();

        });

   }

    function genreBtnClick () {
    	
    	var genre_btn = document.getElementById("genre_btn");
    	genre_btn.addEventListener('click', showDropDown , false );	
    };
	//.card_set { max-height: 340px; .movie_card_list height: 340px;

    function genreMenuVisibleToggle(e) {

        var menu = document.getElementById("drop_down_menu");
       	
        if(e.target.id === "genre_btn")
        {
            if ( menu.style.display === "none")
             { menu.style.display = "block";
                }
            else {
                menu.style.display = "none";
            }
        }
        else if (e.target.className === "genre_li") {
        	var genre = e.target.innerText;
        	changeGenre(genre);
            menu.style.display = "none";
        }
        else
        {
        	 menu.style.display = "none";
        }
    }

    function googleMenuVisibleToggle(e) {
    	var menu = document.getElementById("google_menu");
        
        if(e.target.id === "google_menu_btn")
        {
            if ( menu.style.display === "none")
             { 	
             	menu.style.display = "block";

                }
            else {
            	
                menu.style.display = "none";
            }
        }
       else if (e.target.offsetParent.id != "google_icn_container") {
       		
       			menu.style.display = "none";
     	}
    }

    function showDropDown(e) {
            
        if(e.target.id === "genre_btn"){
            window.onclick = function (e) {
           	genreMenuVisibleToggle(e);
            };
	  	}

	  	else if(this.id === "google_menu_btn"){
             window.onclick = function (e) {
           	googleMenuVisibleToggle(e);
             };

            changeGoogleIcon();	             	           
	  	}
    }

    function changeGoogleIcon() {
    		
    	  var googleicons = document.getElementById("google_ul");
		  var dragged;

		  /* events fired on the draggable target */
		  googleicons.addEventListener("drag", function( event ) {

		  }, false);

		  googleicons.addEventListener("dragstart", function( event ) {
		      // store a ref. on the dragged elem
		      dragged = event.target;
		      // make it half transparent
		      event.target.style.opacity = 0.1;
		  }, false);

		  googleicons.addEventListener("dragend", function( event ) {
		      // reset the transparency
		      event.target.style.opacity = "";
		  }, false);

		  /* events fired on the drop targets */
		  googleicons.addEventListener("dragover", function( event ) {
		      // prevent default to allow drop
		      event.preventDefault();
		  }, false);

		  googleicons.addEventListener("dragenter", function( event ) {
		      // highlight potential drop target when the draggable element enters it
		      if ( event.target.className == "google_icn_li" ) {
		          event.target.style.background = "purple";
		      }

		  }, false);

		  googleicons.addEventListener("dragleave", function( event ) {
		      // reset background of potential drop target when the draggable element leaves it
		      if ( event.target.className == "google_icn_li" ) {
		          event.target.style.background = "";
		      }

		  }, false);

		  googleicons.addEventListener("drop", function( event ) {
		      // prevent default action (open as link for some elements)
		      event.preventDefault();
		      // move dragged elem to the selected drop target
		      if ( event.target.className == "google_icn_li" ) {h
		          event.target.style.background = "";
		          dragged.parentNode.removeChild( dragged );
		          event.target.appendChild( dragged );
		      }
		    
		  }, false);		
    }

    function DelateDataLoadingPage() {
        var gray = document.getElementById('gray');
        var wrapper = document.getElementById('wrapper');
        wrapper.removeChild(gray);
    }

    function changeGenre(genre) {
    	
      
        if(genre=== "이것을 클릭!"){

         loadBooks( function(sBooks) {
               var movie_card_set = document.getElementById('movie_ul_1');
               movie_card_set.innerHTML = sBooks;
               DelateDataLoadingPage();
              });
    	}

    	else{
    		alert("청개구리... 첫번째 것을 클릭해주세요.. ;ㅅ;");
    	}
    }
	


    function loadBooks(callbackFunction) {

        
        var URL = 'http://hwangjjung.com/exam1/bookdata.json';
        var request = new XMLHttpRequest();
        var sTemplate = "<li class='card' id='<%=id%>'><div class='card_content'><a class='card_target' href='<%=PageLink%>'></a><div class='thumnail'><a class='card_target' href='<%=PageLink%>'></a><div class='thumnail_holder'><span class='thumnail_content'><img class='thumnail_image' src= '<%=ImgLink%>' alt='<%=Title%>'/></span></div></div><div class='details'><a class='card_target' href='<%=PageLink%>'></a><h2><a class='title' href='<%=PageLink%>'> <%=Title%> </a></h2><div class='subtitle_container'><a class='subtitle' href='<%=PageLink%>'><%=Genre%></a></div></div><div class='star_and_price'><a class='card_target' href='<%=PageLink%>'></a><div class='star_price_container'><div class='star_content'><a href='<%=PageLink%>'><div class='star_bg'><div class='star_rating' style= 'width: <%=StarRate%>;'></div></div></a></div><div class='price_container'><button class='price_button_movie'><span><%=Price%></span></button></div></div></div></div></li>";

        request.open('GET' , URL , true);
        request.send();
        
        request.onreadystatechange = function (event) {

            if (request.readyState == 4 && request.status == 200) {
                var loadedData = eval('(' + request.responseText +')' );
                var aBookList;
                aBookList = loadedData.books;
                var sBooks = _makeBookElement(aBookList,sTemplate);
                if (callbackFunction && typeof ( callbackFunction ) == "function" ) 
                { callbackFunction (sBooks); } 
                 // Read more: http://mrbool.com/callback-functions-in-javascript/28614#ixzz3Dq7BZV9N
                }
        };

        _showDataLoadingPage();

        function _showDataLoadingPage() {
            var elDiv = document.createElement('div');

            var elGrayfilter = document.createElement('div');
            var elText = document.createElement('p');
            
            elGrayfilter.id = 'gray';
            elGrayfilter.style.position ='absolute';
            elGrayfilter.style.top = '0px';
            elGrayfilter.style.width = '100%';
            elGrayfilter.style.height = '100%';

            elText.innerText="책장 살펴보는 중~";
            elText.style.fontSize='35px';
            elText.style.top = document.body.scrollTop +100 +'px';
            elText.style.textAlign='center';
            elText.style.position='relative';
            elText.style.zIndex = '1000';


            elDiv.style.opacity='0.7';
            elDiv.style.backgroundColor='#ccc';
            elDiv.style.width = '100%';
            elDiv.style.height = '100%';
            elDiv.style.top = '0px';
            elDiv.zIndex='900';
            elDiv.style.position= 'absolute';


            elGrayfilter.appendChild(elText);
            elGrayfilter.appendChild(elDiv);

            var wrapper = document.getElementById('wrapper');

            wrapper.appendChild(elGrayfilter);
        }
        

        function _makeBookElement(aBookList, sTemplate) {
            
            var pattern = {
                title : '<%=Title%>',
                link : '<%=PageLink%>',
                img : '<%=ImgLink%>',
                author : '<%=Genre%>',
                price : '<%=Price%>',
                star : '<%=StarRate%>',
                id : '<%=id%>'
            };
            
            var result = [];

            aBookList.forEach(function(item){
                result.push(
                    _replaceAll(_replaceAll(sTemplate, pattern.link, item.src), pattern.title, item.name).replace(pattern.img, item.imgSrc).replace(pattern.author, item.author).replace(pattern.price, item.price).replace(pattern.star, item.star).replace(pattern.id, item.id));
            });
            var final = result.join('');
            return final;
        }

        function _replaceAll(sValue, param1, param2) {
             return sValue.split(param1).join(param2);
        }     
	}

	




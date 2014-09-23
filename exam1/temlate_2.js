
    window.addEventListener('load', function() {
                setGenreMenuStyle();
                toggleGenreMenu();
                changeGenre();
                }, false);

    function blockVisibleToggle(e) {
        var menu = document.getElementById("drop_down_menu");
        if(e.target.id === "genre_btn")
        {
            if ( menu.style.display === "none")
             {menu.style.display = "block";
                }
            else {
                menu.style.display = "none";
            }
        }
        else {
            menu.style.display = "none";
        }
    }
    function showDropDown(e) {
            blockVisibleToggle(e);
        }
            function setGenreMenuStyle() {
                var eGenreMenu = document.getElementById('drop_down_menu');
                eGenreMenu.style.display = "none";
            }

            function toggleGenreMenu(){
                var eGenreMenu = document.getElementById('drop_down_menu');
                document.addEventListener("click", showDropDown , false);
            }
            
            function changeGenre() {
                var eGenreMenu = document.getElementById('drop_down_menu');
                var eGenreMenuFirstLi = eGenreMenu.querySelector('li:first-child');

                eGenreMenuFirstLi.addEventListener("click", function() {
                    debugger;
                    var	eBooksList = document.querySelector('.movie_card_list > .card');
                    var sBooks = _changeBooks();
                    var eBooksListLength = eBooksList.length;
                    var i;
                    for (i = 0; i < eBooksListLength; i++) {
                        eBooksList[i].innerHTML = sBooks;
                    }
                }, false);
            }

            function _changeBooks() {
                var aBookList = [
                    {
                        id : "book-01",
                        name: "게으름뱅이 탈출학교",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/LF9UMl9DALsC?fife=w170-rw",
                        src : "https://play.google.com/store/books/details/%EC%B5%9C%EC%A0%95_30%EC%9D%BC_%EC%95%88%EC%97%90_%EB%82%B4_%EC%82%AC%EB%9E%8C_%EB%A7%8C%EB%93%A4%EA%B8%B0?id=LF9UMl9DALsC",
                        author : "최정",
                        price : "₩6,000",
                        star : "76%";
                    }, {
                        id : "book-02",
                        name: "감정코칭",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/tpB99PN2arAC?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/존_가트맨_외_존_가트맨_최성애_박사의_내_아이를_위한_감정_코칭?id=tpB99PN2arAC",
                        author : "존 가트맨",
                        price : "₩11,000",
                        star : "76%";
                    },{
                        id : "book-03",
                        name: "당신이 아직 혼자인",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/43T4UOCN8eQC?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/%EC%B5%9C%EC%A0%95_%EB%8B%B9%EC%8B%A0%EC%9D%B4_%EC%95%84%EC%A7%81_%ED%98%BC%EC%9E%90%EC%9D%B8_%EC%A7%84%EC%A7%9C_%EC%9D%B4%EC%9C%A0?id=43T4UOCN8eQC",
                        author : "최정",
                        price : "₩6,500",
                        star : "76%";
                    },{
                        id : "book-04",
                        name: "시험불안 탈출",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/0NsZBAAAQBAJ?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/%EB%85%B8%EC%A7%80%EC%98%81_%EC%8B%9C%ED%97%98%EB%B6%88%EC%95%88_%ED%83%88%EC%B6%9C%ED%95%99%EA%B5%90?id=0NsZBAAAQBAJ",
                        author : "노지영",
                        price : "₩6,000",
                        star : "76%";
                    },{
                        id : "book-05",
                        name: "천국같은 일주일",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/KusUBAAAQBAJ?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/%EC%9D%B4%EC%A4%80%ED%98%B8_%EC%B2%9C%EA%B5%AD_%EA%B0%99%EC%9D%80_%EC%9D%BC%EC%A3%BC%EC%9D%BC%EC%9D%84_%EC%9C%84%ED%95%9C_%EB%B0%94%EB%A5%B4%EC%85%80%EB%A1%9C%EB%82%98_%EC%84%B8%EB%B9%84%EC%95%BC_%EA%B7%B8%EB%9D%BC%EB%82%98%EB%8B%A4?id=KusUBAAAQBAJ",
                        author : "이준호",
                        price : "₩4,500",
                        star : "76%";
                    }, { 
                        id : "book-06",
                        name: "게으름뱅이 탈출학교",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/LF9UMl9DALsC?fife=w170-rw",
                        src : "https://play.google.com/store/books/details/%EC%B5%9C%EC%A0%95_30%EC%9D%BC_%EC%95%88%EC%97%90_%EB%82%B4_%EC%82%AC%EB%9E%8C_%EB%A7%8C%EB%93%A4%EA%B8%B0?id=LF9UMl9DALsC",
                        author : "최정",
                        price : "₩6,000",
                        star : "76%";
                    }, {
                        id : "book-07",
                        name: "감정코칭",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/tpB99PN2arAC?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/존_가트맨_외_존_가트맨_최성애_박사의_내_아이를_위한_감정_코칭?id=tpB99PN2arAC",
                        author : "존 가트맨",
                        price : "₩11,000",
                        star : "76%";
                    },{
                        id : "book-08",
                        name: "당신이 아직 혼자인",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/43T4UOCN8eQC?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/%EC%B5%9C%EC%A0%95_%EB%8B%B9%EC%8B%A0%EC%9D%B4_%EC%95%84%EC%A7%81_%ED%98%BC%EC%9E%90%EC%9D%B8_%EC%A7%84%EC%A7%9C_%EC%9D%B4%EC%9C%A0?id=43T4UOCN8eQC",
                        author : "최정",
                        price : "₩6,500",
                        star : "76%";
                    },{
                        id : "book-09",
                        name: "시험불안 탈출",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/0NsZBAAAQBAJ?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/%EB%85%B8%EC%A7%80%EC%98%81_%EC%8B%9C%ED%97%98%EB%B6%88%EC%95%88_%ED%83%88%EC%B6%9C%ED%95%99%EA%B5%90?id=0NsZBAAAQBAJ",
                        author : "노지영",
                        price : "₩6,000",
                        star : "76%";
                    },{
                        id : "book-10",
                        name: "천국같은 일주일",
                        imgSrc : "https://encrypted.google.com/books/images/frontcover/KusUBAAAQBAJ?fife=w300-rw",
                        src : "https://play.google.com/store/books/details/%EC%9D%B4%EC%A4%80%ED%98%B8_%EC%B2%9C%EA%B5%AD_%EA%B0%99%EC%9D%80_%EC%9D%BC%EC%A3%BC%EC%9D%BC%EC%9D%84_%EC%9C%84%ED%95%9C_%EB%B0%94%EB%A5%B4%EC%85%80%EB%A1%9C%EB%82%98_%EC%84%B8%EB%B9%84%EC%95%BC_%EA%B7%B8%EB%9D%BC%EB%82%98%EB%8B%A4?id=KusUBAAAQBAJ",
                        author : "이준호",
                        price : "₩4,500",
                        star : "76%";
                    },
                ];
                    var sTemplate =
                    "<li id =<%=id%> >
                    <div>
                      <a href=<%=PageLink%>></a>
                            <div>
                                <a class='card_target' href=<%=PageLink%>></a>
                                <div class='thumnail_holder'>
                                    <span class='thumnail_content'>
                                    <img class='thumnail_image' src=<%=ImageLink%> alt=<%=title=%>/>
                                </span>
                                </div>
                            </div>
                            <div class='details'>
                                <a class='card_target' href=<%=PageLink%>></a>
                                <h2>
                                <a class='title'href=<%=PageLink%>><%=Title%></a>
                            </h2>
                                <div class='subtitle_container'>
                                    <a class='subtitle' href=<%=PageLink%>><%=Genre%></a>
                                </div>
                            </div>

                            <div class='star_and_price'>
                                <a class='card_target' href=<%=PageLink%>></a>
                                <div class='star_price_container'>
                                    <div class='star_content'>
                                        <a href=<%=PageLink%>>
                                            <div class='star_bg'>
                                                <div class='star_rating' style= <%=StarRate%> >
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                    <div class='price_container'>
                                        <button class='price_button_movie'>
                                            <span><%=Price%></span>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>";
                    return _makeBookElement();
                    
                    function _makeBookElement() {
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
                                replaceAll(sTemplate, pattern.link, item.src).replace(pattern.title, item.name).replace(pattern.img, item.imgSrc).replace(pattern.author, item.author).replace(pattern.price, item.price).replace(pattern.star, item.star).replace(pattern.id, item.id)
                            );
                        });
                        var final = result.join('');
                        return final;
                    }
                    
                }
                
                function replaceAll(sValue, param1, param2) {
                     return sValue.split(param1).join(param2);
                }
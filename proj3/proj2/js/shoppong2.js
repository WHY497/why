            window.onload = function () {
                var aData = [{
                        "imgUrl": "image/sp1.jpg",
                        "proName": "土腊肉",
                        "proPrice": "79",
                        "proComm": "18"
                    },
                    {
                        "imgUrl": "image/sp2.jpg",
                        "proName": "当地腊肉",
                        "proPrice": "149",
                        "proComm": "1.4"
                    },
                    {
                        "imgUrl": "image/sp3.jpg",
                        "proName": "特产凉面",
                        "proPrice": "99",
                        "proComm": "4.2"
                    },
                    {
                        "imgUrl": "image/sp4.jpg",
                        "proName": "酸辣粉",
                        "proPrice": "29",
                        "proComm": "3.6"
                    },
                    {
                        "imgUrl": "image/sp5.jpg",
                        "proName": "当地水梨",
                        "proPrice": "29",
                        "proComm": "3.6"
                    },
                    {
                        "imgUrl": "image/sp6.jpg",
                        "proName": "猕猴桃",
                        "proPrice": "29",
                        "proComm": "3.6"
                    },
                    {
                        "imgUrl": "image/sp7.jpg",
                        "proName": "土鸡蛋",
                        "proPrice": "29",
                        "proComm": "3.6"
                    },
                    {
                        "imgUrl": "image/sp8.jpg",
                        "proName": "腌制大鸭腿",
                        "proPrice": "29",
                        "proComm": "3.6"
                    },
                ];
                var oBox = document.getElementById("box");
                var oCar = document.getElementById("car");
                var oUl = document.getElementsByTagName("ul")[0];

                for (var i = 0; i < aData.length; i++) {
                    var oLi = document.createElement("li");
                    var data = aData[i];
                    oLi.innerHTML += '<div class="pro_img"><img src="' + data["imgUrl"] +
                        '" width="100" height="100"></div>';
                    oLi.innerHTML += '<h3 class="pro_name"><a href="#">' + data["proName"] + '</a></h3>';
                    oLi.innerHTML += '<p class="pro_price">' + data["proPrice"] + '元</p>';
                    oLi.innerHTML += '<p class="pro_rank">' + data["proComm"] + '万人评价</p>';
                    oLi.innerHTML += '<div class="add_btn">加入购物车</div>';
                    oUl.appendChild(oLi);
                }
                var aBtn = getClass(oBox, "add_btn");
                for (var i = 0; i < aBtn.length; i++) {
                    aBtn[i].index = i;
                    aBtn[i].onclick = function () {
                        var oDiv = document.createElement("div");
                        var data = aData[this.index];
                        oDiv.className = "row hid";
                        oDiv.innerHTML += '<div class="img left"><img src="' + data["imgUrl"] +
                            '" width="80" height="80"></div>';
                        oDiv.innerHTML += '<div class="name left"><span>' + data["proName"] + '</span></div>';
                        oDiv.innerHTML += '<div class="price left"><span>' + data["proPrice"] +
                            '元</span></div>';
                        oDiv.innerHTML += '<div class="ctrl left"><a href="javascript:;">×</a></div>';
                        oCar.appendChild(oDiv);
                        var delBtn = oDiv.lastChild.getElementsByTagName("a")[0];
                        delBtn.onclick = function () {
                            oCar.removeChild(oDiv);
                        }
                    }
                }

                function getClass(oBox, tagname) {
                    var aTag = oBox.getElementsByTagName("*");
                    var aBox = [];
                    for (var i = 0; i < aTag.length; i++) {
                        if (aTag[i].className == tagname) {
                            aBox.push(aTag[i]);
                        }
                    }
                    return aBox
                }
            }
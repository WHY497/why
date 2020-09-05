
    window.onload = init;
    var img;
    var cnt = 0;
    var lb = document.getElementById("lunbo");
    var num = 1;


    function init() {
        img = document.getElementById("img");
        img.onclick = switchImage;
    }

    setInterval(function () {
        num++;
         if (num == 4) {
        num = 1;
         }
         img1.src = "../images/" + num + ".jpg"
    },6000)

    function switchImage() {
        cnt++;
        switch (cnt % 4) {
        case 0:
            img1.src = "../images/1.jpg";
            break;
        case 1:
            img1.src = "../images/2.jpg";
            break;
        case 2:
            img1.src = "../images/3.jpg";
            break;
        case 3:
            ImageBitmap.src = "../images/4.jpg";
            break;
        }
    }

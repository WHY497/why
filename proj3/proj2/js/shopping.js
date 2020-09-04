    function add_shoppingcar(input) {
        var th_row = input.parentElement.parentElement;
        var firstname = th_row.firstElementChild;
        var price = firstname.nextElementSibling;
        var tr = document.createElement("tr");
        var shopping_car = document.getElementById("shopping_car");
        tr.innerHTML = "<td>" + firstname.innerHTML + "</td>" +
            "<td>" + price.innerHTML + "</td>" +
            "<td align='center'>" +
            "<input type='button' value='-' onclick='countNumjian(this);' />" +
            "<input type='text' id='num' size='1' readonly='readonly' value='1'/>" +
            "<input type='button' value='+' onclick='countNumjia(this);' />" +
            "</td>" +
            "<td>" + price.innerHTML + "</td>" +
            "<td align='center'>" +
            "<input type='button' value='X' onclick='remove(this);'/>" +
            "</td>";
        shopping_car.append(tr);
        total();
    }

    function remove(obj) {
        var tr = obj.parentNode.parentNode;
        var tbody = tr.parentNode;
        tbody.removeChild(tr);
        total();
    }

    function countNumjia(obj) {
        var num = document.getElementById("num").value;
        var price = obj.parentNode.previousSibling;
        var money = obj.parentNode.nextSibling;
        num++;
        document.getElementById("num").value = num;
        money.innerHTML = price.innerHTML * num;
        total();
    }

    function countNumjian(obj) {
        var num = document.getElementById("num").value;
        var price = obj.parentNode.previousSibling;
        var money = obj.parentNode.nextSibling;
        if (num > 0) {
            num--;
            document.getElementById("num").value = num;
            money.innerHTML = price.innerHTML * num;
        } else {
            document.getElementById("num").value = 0;
            money.innerHTML = price.innerHTML * num;
        }
        total();
    }

    function total() {
        var tbody = document.getElementById("shopping_car");
        var trs = tbody.getElementsByTagName("tr");
        var sum = 0;
        for (var i = 0; i < trs.length; i++) {
            var tds = trs[i].getElementsByTagName("td");
            var a = tds[3].innerHTML;
            sum += parseFloat(a);
        }
        document.getElementById("total").innerHTML = sum;
    }
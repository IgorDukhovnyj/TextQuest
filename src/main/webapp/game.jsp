<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Пригоди одного хоббіта</title>
    <style>
        body{
            background:#1e1e1e;
            color:white;
            font-family:Arial;
            display:flex;
            justify-content:center;
            align-items:center;
            height:100vh;
        }
        .game-window{
            background:#2e2e2e;
            padding:40px;
            border-radius:10px;
            width:400px;
            text-align:center;
            box-shadow:0 0 15px black;
        }
        button{
            width:200px;
            padding:10px;
            margin:10px;
            border:none;
            border-radius:5px;
            background:#4CAF50;
            color:white;
            font-size:16px;
            cursor:pointer;
        }
        button:hover{
            background:#66bb6a;
        }
        .player-info{
            margin-bottom:20px;
            font-size:14px;
            color: #f4ff00;
        }
        .history{
            margin-top:20px;
            text-align:left;
            color: #008a1e;
        }
    </style>
</head>
<body>

<div class="game-window">

    <div class="player-info">
        Гравець: ${sessionScope.player}<br>
        Зіграно ігор: ${sessionScope.games}
    </div>

    <p>${scene.text}</p>

    <c:choose>

        <c:when test="${scene.end}">

            <h3>
                <c:if test="${scene.win}">
                    Перемога!
                </c:if>

                <c:if test="${!scene.win}">
                    Поразка!
                </c:if>
            </h3>

            <form action="index.jsp">
                <button>Грати знову</button>
            </form>

        </c:when>
        <c:otherwise>
            <form method="post">

                <button name="choice" value="1">
                        ${scene.option1}
                </button>

                <button name="choice" value="2">
                        ${scene.option2}
                </button>
            </form>
        </c:otherwise>
    </c:choose>
    <div class="history">
        <h4>Твій шлях:</h4>
        <ul>
            <c:forEach var="step" items="${sessionScope.history}">
                <li>${step}</li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>



<%--<body>--%>

<%--<h3>Пригоди поважного хоббіта із Ширу на ім'я: ${sessionScope.player}</h3>--%>

<%--<p>Хоббіт: ${sessionScope.player}</p>--%>
<%--<p>Розпочато пригод: ${sessionScope.games}</p>--%>
<%--<h1>Твій шлях:</h1>--%>
<%--<ul>--%>
<%--    <c:forEach var="step" items="${sessionScope.history}">--%>
<%--        <li>${step}</li>--%>
<%--    </c:forEach>--%>
<%--</ul>--%>


<%--<h3><p>${scene.text}</p></h3>--%>

<%--<c:choose>--%>

<%--    <c:when test="${scene.end}">--%>

<%--        <form action="index.jsp">--%>
<%--            <button>Розпочати пригоду з початку</button>--%>
<%--        </form>--%>

<%--    </c:when>--%>

<%--    <c:otherwise>--%>

<%--        <form method="post">--%>

<%--            <button name="choice" value="1">--%>
<%--                    ${scene.option1}--%>
<%--            </button>--%>

<%--            <button name="choice" value="2">--%>
<%--                    ${scene.option2}--%>
<%--            </button>--%>

<%--        </form>--%>

<%--    </c:otherwise>--%>

<%--</c:choose>--%>

<%--</body>--%>
</html>
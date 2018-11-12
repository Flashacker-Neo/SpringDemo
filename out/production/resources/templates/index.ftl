<#import "/spring.ftl" as spring />
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/bootstrap.css'/>"/>
<script src="<@spring.url '/js/bootstrap.js'/>"></script>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>

<h1>Coucou</h1>

<div>
    <form action="/save" method="POST">
        <label>First name</label></br>
        <input type="text" name="firstname">
        </br>
        <label>Last name</label></br>
        <input type="text" name="lastname">
        </br>
        <input type="submit" value="Envoyer">
    </form>

</div>
<!DOCTYPE html>
<html>
<head>
	<title>Reveal yourself</title>
</head>
<body>
	<form action="Data" method="GET">
	<ul>
		<li>
			Name: <input id="element_1_1" name= "spyName" class="element text" maxlength="255" size="8" value=""/>
		</li>
		<span>
			<input id="element_3_1" name="assassin" class="element checkbox" type="checkbox" value="1" />
			<label class="choice" for="element_3_1">Assassin</label>
			<input id="element_3_2" name="whistle" class="element checkbox" type="checkbox" value="1" />
			<label class="choice" for="element_3_2">Whistle Blower</label>
			<input id="element_3_3" name="eaves" class="element checkbox" type="checkbox" value="1" />
			<label class="choice" for="element_3_3">Eavesdropper</label>
		</span> 
	</ul>
		<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" action="spyForm"/>
	</form>
</body>
</html>
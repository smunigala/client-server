
<!DOCTYPE HTML>
<html>
<head>
	<title>Server-Sent Events Servlet example</title>
	<style>
		body {
			font-family: sans-serif;
		}
	</style>
</head>
<body>

	Time: <span id="foo"></span>
	
	<br><br>
	<button onclick="start()">Start</button>

	<script>
	function start() {
		var eventSource = new EventSource("SimpleServlet");
		eventSource.onmessage = function(event) {
			document.getElementById('foo').innerHTML = event.data;
		};
	}
		
	</script>
</body>
</html>
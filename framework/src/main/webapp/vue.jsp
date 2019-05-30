<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<title></title>
</head>
<body>
<div id="app" >
  {{ message1 }}
</div>
<div id="app-2">
  <span v-bind:title="message">
    鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>
<div id="app-4">
  <ol>
    <li v-for="todo in todos">
      {{ todo.text }}
    </li>
  </ol>
</div>
</body>
</html>
<script>
var app = new Vue({
	  el: '#app',
	  data: {
	    message1: 'Hello Vue!'
	  }
})
var app2 = new Vue({
	  el: '#app-2',
	  data: {
	    message: '页面加载于 ' + new Date().toLocaleString()
	  }
	})
var app4 = new Vue({
	  el: '#app-4',
	  data: {
	    todos: [
	      { text: '学习 JavaScript' },
	      { text: '学习 Vue' },
	      { text: '整个牛项目' }
	    ]
	  }
	})
</script>
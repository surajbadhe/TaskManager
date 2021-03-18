 <!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="https://stackedit.io/style.css" />
</head>

<body class="stackedit">
  <div class="stackedit__html"><h1 id="task">Task</h1>
<p>Create two rest services as follows :</p>
<ul>
<li>
<h3 id="service-1">service 1</h3>
called saveTask which receives a json payload and saves it for future recall, one thing which is important to note the payload for the task is encrypted and need to be decrypted before saving into DB,</li>
</ul>
<h3 id="Request">Request</h3>
<pre><code>    {
    "channel": null,
    "conversationId": null,
    "country": null,
    "json_data": {
        "blob": "eyJvcmdfaWQiOiI2aXhucW5teSIsImFwaV9rZXkiOiIiLCJzZXNzaW9uX2lkIjoid2ViLWMxNjk2ODk5LWQwMTUtNDdjOS05NDcyLTlhNjY1ZTI4Y2VmOTE2MTIzNjk1OTQ3OTkiLCJhcGlfdHlwZSI6InNlc3Npb24tcXVlcnkiLCJzZXJ2aWNlX3R5cGUiOiJhbGwiLCJldmVudF90eXBlIjoibG9naW4iLCJwb2xpY3kiOiJ3dV9sb2dpbiIsInBhZ2VfaWQiOiIxIiwiaW5wdXRfaXBfYWRkcmVzcyI6IjI0NS4yNCiaWxlX2Jyb3dzZXIiLCJ3ZWJfc2Vzc2lvbl9pZCI6IndlYi1jMTY5Njg5OS1kMDE1LTQ3YzktOTQ3Mi05YTY2NWUyOGNlZjkiLCJvdXRwdXRfZm9ybWF0IjoianNvbiJ9",
        "type": "THREAT_MET",
    },
    "security": {
        "client_ip": "172058014251",
        "auth_token": "web-c1696899-d015-47c9-9472-9a665e28cef9"
    }
}
</code></pre>
<h3 id="response">Response</h3>
<pre><code>{
    "data": {
        "created_at": "1612369604",
        "expiring_at": "1612974404",
        "type": "THREAT_MET",
        "updated_at": "1612369604"
        "task_token" : "ksekjhse230209kjsdsl"
    },
    "security": {
        "client_ip": "172058014251",
            "auth_token": "web-c1696899-d015-47c9-9472-9a665e28cef9"
    }
}
</code></pre>
<blockquote>
<p>Note : client that sends the request should be authenticated via a token. unauthorized clients can not save task.</p>
</blockquote>
<ul>
<li>
<h3 id="service-2">Service 2</h3>
</li>
<li>retrieve the saved tasks and mark its status in DB as resumed.</li>
<li></li>
</ul>
<h3 id="request">Request</h3>
<pre><code>{
    "data": {
        "created_at": "1612369604",
        "expiring_at": "1612974404",
        "type": "THREAT_MET",
        "updated_at": "1612369604"
        "task_token" : "ksekjhse230209kjsdsl"
    },
    "security": {
        "client_ip": "172058014251",
            "auth_token": "web-c1696899-d015-47c9-9472-9a665e28cef9"
    }
}
</code></pre>
<h3 id="response-1">Response</h3>
<pre><code>{
    "status" : "Success",
    "msg" : "task has been resumed"
}
</code></pre>
<h1 id="technology-to-use">technology to use</h1>
<ul>
<li>spring boot</li>
<li>maven</li>
<li>json</li>
<li>any db</li>
</ul>
</div>
</body>
</html>

![grab-landing-page](https://github.com/surajbadhe/TaskManager/blob/master/Task_Create_Update_Get_Demo_GIF.gif)

<!-- 定义模板-->	
<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
<br/>
<#--
  if标记 键=值
  -->
 我的性别是：  <br/>
  <#if sex = '1'>
 	男 <br/>
  <#else>
       女 <br/>
  </#if>
  <#--
   list循环标记   数据或集合   as 临时变量
   临时变量_index   获取当前的索引从0开始 
    break 标记用于退出循环
  -->
 输出数组结果： <br/>
  <#list arr as tmp>
  	<#if tmp_index=2>
  		<#break>
  	</#if>
  	<#if (tmp_index+1)%2==0>
  		<font color=green size=10>${tmp}--->${tmp_index+1}</font> <br/>
  		<#else>
  		 <font color=red size=10>${tmp}--->${tmp_index+1}</font> <br/>
  	</#if>
  </#list>
 
  输出list结果： <br/>
  <#list userList as userTmp>
  	${userTmp.id}---->${userTmp.name} <br/>
  </#list>
   <br/>
</body>
</html>  
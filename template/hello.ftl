<!-- ����ģ��-->	
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
  if��� ��=ֵ
  -->
 �ҵ��Ա��ǣ�  <br/>
  <#if sex = '1'>
 	�� <br/>
  <#else>
       Ů <br/>
  </#if>
  <#--
   listѭ�����   ���ݻ򼯺�   as ��ʱ����
   ��ʱ����_index   ��ȡ��ǰ��������0��ʼ 
    break ��������˳�ѭ��
  -->
 ����������� <br/>
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
 
  ���list����� <br/>
  <#list userList as userTmp>
  	${userTmp.id}---->${userTmp.name} <br/>
  </#list>
   <br/>
</body>
</html>  
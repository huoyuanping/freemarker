<#--定义宏-->
<#macro mymacro p1 p2>
我的结果是：${p1+p2}
</#macro>
<@mymacro p1=10 p2=20/>
<#--FTL内置的处理函数-->
<#assign str='   hello my name is zhang    '>
<#assign str1='HELLO WORLD'>
<#--获取长度-->
${str?length}
<#--取空格-->
--${str?trim}--
<#--转小写-->
${str1?lower_case}
<#--转大写-->
${str?upper_case}
<#--获得序列中元素的数目-->
${userList?size}
<#--取得数字的整数部分-->
${1.6?int}
${userList?size}
<#--精度为3位-->
${1.656464513546313574652?float}
<#--判断变量是否存在-->
<#if  aaa?exists>
${aaa}
</#if>
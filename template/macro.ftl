<#--�����-->
<#macro mymacro p1 p2>
�ҵĽ���ǣ�${p1+p2}
</#macro>
<@mymacro p1=10 p2=20/>
<#--FTL���õĴ�����-->
<#assign str='   hello my name is zhang    '>
<#assign str1='HELLO WORLD'>
<#--��ȡ����-->
${str?length}
<#--ȡ�ո�-->
--${str?trim}--
<#--תСд-->
${str1?lower_case}
<#--ת��д-->
${str?upper_case}
<#--���������Ԫ�ص���Ŀ-->
${userList?size}
<#--ȡ�����ֵ���������-->
${1.6?int}
${userList?size}
<#--����Ϊ3λ-->
${1.656464513546313574652?float}
<#--�жϱ����Ƿ����-->
<#if  aaa?exists>
${aaa}
</#if>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%
    //request, response 사용 가능   //service로직이 자동으로 호출된다.
    MemberRepository memberRepository = MemberRepository.getInstance();
    String username = request.getParameter("username");
    System.out.println("username = " + username);
    int age = Integer.parseInt(request.getParameter("age"));
    System.out.println("age = " + age);

    Member member = new Member(username,age);
    memberRepository.save(member);
%>
<html>
<head>
      <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>




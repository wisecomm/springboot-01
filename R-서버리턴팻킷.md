# 서버 리턴 코드

- acc token 기간만료 --> ref token 확인 후 ( acc 생성 후 전송, (클라이언트 처리는 ???) ), 리프레쉬 token 은 재 생성하지 않음(로그인 요청)

-- acc token exparid ( acc 재 생성 )
{
"failMsg": null,
"accessToken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInJlZ0RhdGUiOjE3NDE5MjU5MjcxNzZ9.eyJ1c2VySWQiOiJkYW55b2giLCJzdWIiOiIwIiwiZXhwIjoxNzQxOTI2ODI3fQ.Qva6mDSahqCAnndgzCxF2LlhjAIQHDH7xh7mCJKoYaQ",
"status": 401
}
-- acc, ref token error 시
{
"reason": "재 로그인이 필요합니다.",
"code": "9999",
"message": "OTHER TOKEN ERRORjava.lang.Exception: 재 로그인이 필요합니다.",
"status": 403
}

-- http://localhost:8080/api/v1/user/login 조회
{
"userInfo": {
"userSq": 1,
"userId": "danyoh",
"userPw": "1234",
"userNm": "오정일",
"userSt": "S"
},
"resultCode": 200,
"failMsg": null,
"accessToken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInJlZ0RhdGUiOjE3NDE5MTU5NTkzNjJ9.eyJ1c2VyTm0iOiLsmKTsoJXsnbwiLCJ1c2VySWQiOiJkYW55b2giLCJzdWIiOiIxIiwiZXhwIjoxNzQxOTE2ODU5fQ.yKee5W6t-tmkqIhusn0kE5HsjiXbN3VoGuYr9tDNFG4",
"refreshToken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInJlZ0RhdGUiOjE3NDE5MTU5NTkzNzZ9.eyJ1c2VySWQiOiJkYW55b2giLCJzdWIiOiIxIiwiZXhwIjoxNzQzMTI1NTU5fQ.LvjPJVhfRdDIP0me2VlVfOetOX-ktZwzE9ZRRWJoK10"
}

# 서버 리턴 팻킷

{
"date": "2025-03-14T13:39:01.461+09:00",
"status": 200,
"error": "OK",
"code": "E0001",
"message": "UNAUTHORIZED"
}

{
"code": "0000",
"data": {
"key": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzdXBlcmFkbWluIiwiYXV0aCI6IlJPTEVfU19BRE1JTixST0xFX1VTRVIiLCJMT0dJTl9UWVBFIjoiQSIsIkNPUlBfQ09ERSI6IjAwMDAiLCJpYXQiOjE3NDE5MjcyNjUsImV4cCI6MTc0MjUzMjA2NX0.CRq8Vo4BS3wRRY4W0ilV0ISEHVWXrYVcHCG4co5yfJVc6_IfnJLBe3RfWB4ymuKX72laXRToZ-cxZXXlmFoDIQ",
"corp_code": "0000",
"man_corp_code": "",
"login_time_current": "2024-11-25T13:16:57.000+09:00",
"login_ip": "192.168.100.5",
"roleid": "SAD",
"need_change_pwd": false
}
}

{
"date": "2025-03-14T13:41:43.975+09:00",
"status": 200,
"error": "OK",
"code": "E1001",
"message": "로그인 정보가 올바르지 않습니다."
}

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

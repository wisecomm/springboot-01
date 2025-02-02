# 스프링 부트 초기 환경 
> 하루에 1번, 11분 tutorial - Github repository 관리

- 스프링 부트 프로젝트 생성 : https://start.spring.io/
 : dependence ( Lombok, Spring Web, MyBatis Framework, PostgreSQL Driver )

- 사용 라이브러리 
  - Lombok, MyBatis Framework, PostgreSQL Driver


## 확인 필요
- DB 테이블 업그레이드 테스트 (기존 소스 확인 후 빌드 및 환경 확인)
 > 테스트 레스트 추가 : http://localhost:8080, http://localhost:8080/greeting

# 채크 포인트 
- [ ] 마이바티스 테스트 추가 
- [ ] 데이블 업데이트 확인 후 추가 

# 도커 만들기 (스프링 부트)
- 도커파일 만듬 : Dockerfile 파일 확인, 
  > 도커 실행(맥) :  docker build -t simple-spring-boot-app . --platform linux/amd64
  > 도커 데스크탑 image 에 생성되었는지 확인 
        


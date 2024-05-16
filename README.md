# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전
### 상품
| 한글명  | 영문명 | 설명 |
|------| --- | --- |
| 상품 | Product | 판매될 수 있는 물리적 제품 |
| 상품 가격 | Product Price | 상품을 구매하기 위해 지불해야하는 금액  |
| 상품 이름 | Product Name | 제품을 식별하기 위한 명칭 |

### 메뉴
| 한글명  | 영문명 | 설명 |
|------| --- | --- |
| 메뉴 그룹 | Menu Group | 여러 메뉴들을 특정 기준으로 묶은 모음 |
| 메뉴 그룹 이름 | Menu Group Name | e.g. 세트A, 나홀로 메뉴, 셋트 메뉴 |
| 메뉴 | Menu | 손님이 구매할 수 있는 최소 단위 |
| 메뉴 이름 | Menu Name | 메뉴 상품들을 대표하는 명칭 |
| 메뉴 가격 | Menu Price | 손님이 지불해야될 금액 |
| 메뉴 상품 | Menu Product | 손님에게 제공하는 제품 |
| 메뉴 상품 개수 | Menu Product Count | 손님에게 제공되는 제품 수량 |
| 메뉴 노출됨 | Menu Displayed | 손님에게 메뉴가 보여지지 않음 |
| 메뉴 숨겨짐 | Menu Hided | 손님에게 메뉴가 노출됨 |

### 주문
| 한글명  | 영문명 | 설명 |
|------| --- | --- |
| 주문 | Order | 손님이 메뉴를 구매하기 위한 요청 |
| 주문 항목 | Order Line Item | 손님이 요청한 메뉴 모음 |
| 주문 유형 | Order Type | 매장 주문 / 포장 주문 / 배달 주문 |
| 주문 상태 | Order Status | 대기중, 접수됨, 제공됨, 배달중, 배달 완료, 완료 |
| 주문 테이블 | Order Table | 매장 주문 손님이 사용하는 테이블 |
| 주문 테이블 이름 | Order Table Name | e.g. 1번 테이블, 2번 테이블, 3번 테이블 |
| 주문 테이블 사용중  | Order Table Occupied | 손님이 이용중인 상태 |
| 주문 테이블 비었음 | Order Table Cleared | 손님이 이용중이지 않은 상태 |
| 배달 | Order Delivery | 손님이 요청한 메뉴를 포장하여 지정된 목적지로 전달하는 과정 |
| 배달 주소 | Order Delivery Address | e.g. 서울특별시 … 선릉역 태크살롱  |
| 배달 담당자 | Order Delivery Rider | 손님에게 메뉴를 전달하는 역할을 맡은 사람 |
| 주문을 하지 않은 손님 | Guest | 방문은 했지만 주문을 하지 않은 고객 |
| 주문을 한 손님 | Customer | 주문을 한 고객 |

## 모델링

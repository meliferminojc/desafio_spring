# Desafio Spring
## _Bootcamp Meli W2_

### Observações

- Realizar o cadastro da categoria para poder cadastrar um post
- Realizar o cadastro do vendedor antes de realizar o post
- Realizar o cadastro do comprador para poder seguir ou parar de seguir um vendedor
- Arquivo `requests.json` pode ser importado no Insomnia para facilitar os testes

## Requests

### Category

- Create Category
  `POST - http://localhost:8080/api/category/create`

```json
{
	"categoryName": "Gamer"
}
```
- List Category
  `GET - http://localhost:8080/api/category/create`

####   Response

```json
[
  {
    "id": 1,
    "categoryName": "Games"
  }
]
```

### Sellers

- Create Seller
  `POST - http://localhost:8080/api/seller/create`

```json
{
	"userName": "Renan Fermino"
}
```
- Seller followers Counter
  -- `Integer: userId`
  -- `GET - localhost:8080/api/seller/{userId}/followers/count`

- Response

```json
{
  "id": 1,
  "userName": "Renan Fermino",
  "followersCount": 1
}
```

### Customer

- Create Customer
  `POST - http://localhost:8080/api/customer/create`

```json
{
	"name": "William Firmino"
}
```

- Follow seller
  - `POST - http://localhost:8080/api/customer/{customerId}/follow/{sellerId}`
  -  `Integer - userId`
  -  `Integer - sellerId`

- UnFollow seller
- `POST - http://localhost:8080/api/customer/{customerId}/follow/{sellerId}`
  -  `Integer - userId`
  -  `Integer - sellerId`

- Get Customer follows
  - [OPTIONAL] order=name_desc
  - [OPTIONAL] order=name_asc
  - `Integer: customerID`
  - `GET http://localhost:8080/api/customer/{customerId}/followers/list`
  - `GET http://localhost:8080/api/customer/{customerId}/followers/list?order=name_asc`
  - `GET http://localhost:8080/api/customer/{customerId}/followers/list?order=name_desc`
  - Response
```json
{
  "id": 1,
  "userName": "Kenyo",
  "follows": [
    {
      "id": 1,
      "userName": "Renan Fermino"
    },
    {
      "id": 2,
      "userName": "Bruno Stape"
    }
  ]
}
```

### Posts

- Create Post
  - `POST http://localhost:8080/api/products/newpost`
  - Body request
```json
{
	"sellerId": 1,
	"date": "29-06-2021",
	"product": {
		"productName": "Cadeira Gamer",
		"type": "Gamer",
		"brand": "Racer",
		"color": "Red & Black",
		"notes": "Special Edition"
	},
	"categoryId": 1,
	"price": 1500.50
}
```
- Response
```json
{
  "userId": 1,
  "date": "29-06-2021",
  "product": {
    "id": 4,
    "productName": "Cadeira Gamer",
    "type": "Gamer",
    "brand": "Racer",
    "color": "Red & Black",
    "notes": "Special Edition"
  },
  "category": 1,
  "price": 1500.5
}
```
- Get Seller Posts
  - `Integer: customerID`
  - `GET http://localhost:8080/api/products/followed/{sellerID}/list`
  - Response
```json
{
  "userId": 1,
  "postList": [
    {
      "id": 4,
      "date": "29-06-2021",
      "seller": 1,
      "product": {
        "id": 4,
        "productName": "Cadeira Gamer",
        "type": "Gamer",
        "brand": "Racer",
        "color": "Red & Black",
        "notes": "Special Edition"
      },
      "categoryId": 1,
      "price": 1500.5,
      "localDate": "2021-06-28"
    }
  ]
}
```

- Create PromoPost
  - `POST http://localhost:8080/api/products/newpromopost`
  - Body request
```json
{
  "sellerId": 1,
  "date": "01-07-2021",
  "product": {
    "productName": "Cadeira Gamer",
    "type": "Gamer",
    "brand": "Racer",
    "color": "Red & Black",
    "notes": "Special Edition"
  },
  "categoryId": 1,
  "price": 1500.50,
  "hasPromo": true,
  "discount": 1.25
}
```
- Response
```json
{
  "userId": 1,
  "date": "01-07-2021",
  "product": {
    "id": 1,
    "productName": "Cadeira Gamer",
    "type": "Gamer",
    "brand": "Racer",
    "color": "Red & Black",
    "notes": "Special Edition"
  },
  "category": 1,
  "price": 1500.5,
  "hasPromo": true,
  "discount": 1.25
}
```

- Get Total Seller PromoPosts
  - `Integer: sellerID`
  - `GET http://localhost:8080/api/products/{sellerID}/countPromo/list`
  - Response
```json
{
  "userId": 1,
  "userName": "Renan Fermino",
  "promoProducts_count": 6
}
```

- Get Seller PromoPosts
  - `Integer: sellerID`
  - `GET http://localhost:8080/api/products/followed/{sellerID}/promolist`
  - Response
```json
{

  "userId": 1,
  "userName": "Marcelo Eugenio",
  "posts": [
    {
      "id": 1,
      "date": "01-07-2021",
      "seller": 1,
      "product": {
        "id": 1,
        "productName": "Cadeira Gamer",
        "type": "Gamer",
        "brand": "Racer",
        "color": "Red & Black",
        "notes": "Special Edition"
      },
      "categoryId": 1,
      "price": 1500.5,
      "discount": 1.25,
      "hasDiscount": true,
      "localDate": "2021-06-30"
    }
  ]
}
```
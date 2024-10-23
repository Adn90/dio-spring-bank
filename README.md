<h1 align="center">
   API REST na Nuvem com Railway
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

API REST simples de sistema bancário utilizando Spring Boot 3, Java 17 e Railway. Bootcamp Deal - Spring Boot e Angular (17+)

## Tecnologias

- [Spring](https://spring.io/)

### Dados para uso

Json para cadastro de usuário

```Json
{
  "id": 0,
  "name": "John Doe",
  "account": {
    "number": "123456789",
    "agency": "001",
    "balance": 1500.75,
    "limit": 5000
  },
  "features": [
    {
      "icon": "🔒",
      "description": "Secure login"
    },
    {
      "icon": "📈",
      "description": "Real-time transaction alerts"
    }
  ],
  "card": {
    "number": "4111111111111111",
    "limit": 2000
  },
  "news": [
    {
      "icon": "📰",
      "description": "New features coming soon!"
    },
    {
      "icon": "⚡",
      "description": "Get 10% off on your next purchase."
    }
  ]
}
```
# 🚀 Spring Boot + OpenAI ChatGPT API Integration

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.5-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![OpenAI](https://img.shields.io/badge/OpenAI_API-Chat_Completions-412991?style=for-the-badge&logo=openai&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

> 🇺🇸 **English** | 🇧🇷 **[Português](#-integração-spring-boot--openai-chatgpt-api)**

A clean, lightweight, **zero-SDK** boilerplate demonstrating how to integrate OpenAI's Chat Completions API (`/v1/chat/completions`) directly into a **Java 17 + Spring Boot 3** REST API using native `RestTemplate` and Lombok.

Instead of pulling heavy third-party wrappers that quickly go out of date when OpenAI updates its endpoints, this project shows how to model the payload (`ChatgptBody`, `Message`, `Choice`, `Usage`) cleanly with standard Spring components.

---

## ✨ Features

- **Zero External AI SDKs:** Uses pure Spring `RestTemplate` + Jackson serialization.
- **Clean Architecture:** Decoupled service interface (`ChatGpt`) and implementation (`ChatGptIntegration`).
- **Ready-to-Use REST Endpoint:** Simple `GET /gpt/{message}` controller for quick testing.
- **Easy Model Switching:** Easily swap `gpt-3.5-turbo`, `gpt-4o`, or `gpt-4o-mini` in the payload builder.

## 🏗️ Architecture

```
demo/src/main/java/com/example/chatgpt/demo/
├── config/
│   └── RestTemplateConfig.java       # Spring Bean configuration for HTTP calls
├── controller/
│   └── ChatgptController.java        # REST endpoint (/gpt/{message})
└── integration/
    ├── ChatGpt.java                  # Integration contract interface
    ├── ChatGptIntegration.java       # OpenAI /v1/chat/completions client
    └── model/                        # Request & Response DTOs (Lombok)
        ├── ChatgptBody.java
        ├── ChatGptResponse.java
        ├── Choice.java
        ├── Message.java
        └── Usage.java
```

## 🚀 Getting Started

### Prerequisites
- **Java 17+**
- **Maven 3.8+** (or use the included `./mvnw` wrapper)
- An **OpenAI API Key**

### 1. Clone the repository
```bash
git clone https://github.com/viniciusscience/chatGptIntegration.git
cd chatGptIntegration/demo
```

### 2. Configure your API Key
Edit `src/main/resources/application.properties`:

```properties
chatgpt.apiKey=YOUR_OPENAI_API_KEY
chatgpt.url=https://api.openai.com/v1/chat/completions
```

### 3. Run the application
```bash
./mvnw spring-boot:run
```

### 4. Test the Endpoint
Send a request to `http://localhost:8080/gpt/{message}`:

```bash
curl "http://localhost:8080/gpt/Hello%20ChatGPT!"
```

**Example JSON Response:**
```json
{
  "role": "assistant",
  "content": "Hello! How can I assist you today?"
}
```

---

## 🇧🇷 Integração Spring Boot + OpenAI ChatGPT API

Um template limpo, leve e **sem dependência de SDKs externos** mostrando como integrar a API de Chat Completions da OpenAI (`/v1/chat/completions`) diretamente em uma API REST **Java 17 + Spring Boot 3** utilizando `RestTemplate` nativo e Lombok.

Em vez de depender de bibliotecas de terceiros que ficam desatualizadas rapidamente, este projeto demonstra como estruturar os contratos de requisição e resposta (`ChatgptBody`, `Message`, `Choice`, `Usage`) de forma limpa e direta no ecossistema Spring.

### Como executar rapidamente
1. Clone o repositório e acesse a pasta `demo`:
   ```bash
   git clone https://github.com/viniciusscience/chatGptIntegration.git
   cd chatGptIntegration/demo
   ```
2. Configure sua chave da OpenAI em `src/main/resources/application.properties`:
   ```properties
   chatgpt.apiKey=SUA_CHAVE_OPENAI
   chatgpt.url=https://api.openai.com/v1/chat/completions
   ```
3. Execute com o Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Teste no navegador ou via `curl`:
   ```bash
   curl "http://localhost:8080/gpt/Explique%20arquitetura%20limpa%20em%20uma%20frase"
   ```

---

## 🤝 Contributing & Support

If this template helped you kickstart your Java + OpenAI integration, consider giving it a ⭐ **Star** on GitHub! Pull requests and issues are welcome.

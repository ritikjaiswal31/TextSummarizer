# TextSummarizer

## Project Overview

An AI-powered text summarization application built with Spring Boot and Spring AI. The application accepts text through a REST API and generates a concise summary using an LLM.

## Tech Stack

- Spring Boot
- Spring AI

## Implementation

- Developed a REST API using Spring Boot to accept text input.
- Integrated Spring AI `ChatClient` to process the input and generate a concise summary.
- Configured OpenRouter as the LLM provider using its OpenAI-compatible API.
- Secured API credentials using environment variables instead of storing them in the source code.

### API Endpoint

<img width="1918" height="1140" alt="Screenshot 2026-10-05 134205" src="https://github.com/user-attachments/assets/8e5460a5-fcd8-4558-9cd5-1dce1581fe92" />

# Crypto Tracker Compose

A modern Android application built with Jetpack Compose that allows users to track cryptocurrency prices, view historical data, and manage their favorite coins.

# :camera_flash: **Screenshots** :camera_flash:

| Coin List  Screen                                   | Coin List  Screen                                     |
|-----------------------------------------------------|-------------------------------------------------------|
| <img width="160" src="./assets/CoinListScreen.gif"> | <img width="160" src="./assets/CoinDetailScreen.gif"> |



## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture Overview](#architecture-overview)
  - [Network Handling](#network-handling)
  - [Data Mapping](#data-mapping)
  - [Domain Logic](#domain-logic)
  - [Observing Data](#observing-data)
  - [Data Sources](#data-sources)
- [Installation](#installation)
- [Usage](#usage)
- [Monetization Strategies](#monetization-strategies)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## Features

- Real-time cryptocurrency price tracking.
- Detailed information for each cryptocurrency.
- User-friendly interface built with Jetpack Compose.
- Interactive charts for historical price data.
- Favorite coins management for quick access.

## Technologies Used

### 1. Kotlin
- **Description**: Modern programming language for Android development.
- **Benefits**: Concise syntax, null safety, and strong functional programming support.

### 2. Jetpack Compose
- **Description**: UI toolkit for building native Android UIs.
- **Benefits**: Simplifies UI development with a declarative approach and reduces XML usage.

### 3. Retrofit
- **Description**: Type-safe HTTP client for Android.
- **Benefits**: Simplifies API calls and JSON parsing, supports asynchronous requests.

### 4. Hilt
- **Description**: Dependency injection library for Android.
- **Benefits**: Simplifies dependency management and improves testability.

### 5. Coroutines
- **Description**: Asynchronous programming framework in Kotlin.
- **Benefits**: Simplifies async code, reduces callback hell, and provides structured concurrency.

### 6. Room
- **Description**: Persistence library for SQLite.
- **Benefits**: Simplifies database interactions, supports compile-time SQL verification.

### 7. Material Design
- **Description**: Design system for building visually appealing UIs.
- **Benefits**: Ensures consistency and usability across the app.

### 8. LiveData and StateFlow
- **Description**: Observable data holders for UI components.
- **Benefits**: Lifecycle-aware updates and better state management.

## Architecture Overview

The app follows a clean architecture pattern, which promotes separation of concerns and enhances maintainability.

### Network Handling
- **Retrofit** is used to make API requests to cryptocurrency APIs (e.g., CoinGecko, CoinPaprika).
- Proper error handling is implemented to manage network issues and inform users.

### Data Mapping
- **Data Transfer Objects (DTOs)** represent the structure of JSON responses.
- Mapping functions convert DTOs to domain models for use in the application.

### Domain Logic
- **Use Cases** encapsulate business operations and interact with repositories.
- **Repositories** mediate between data sources and the domain layer, providing a clean API for data access.

### Observing Data
- **LiveData** and **StateFlow** are used in ViewModels to expose data to the UI.
- The UI reacts to changes in data, ensuring a responsive user experience.

### Data Sources
- **Remote Data Source**: Fetches data from APIs using Retrofit.
- **Local Data Source**: Interacts with the Room database for offline data storage and retrieval.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/Crypto-Tracker-Compose.git

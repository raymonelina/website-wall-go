# Wall Go Website

This repository contains a Spring Boot backend and a React/Three.js frontend for a simple Wall Go game. Players can register/login and start a game either against another player or an AI (placeholder logic).

## Backend (Spring Boot)

Requirements: Java 17+ and Maven.

```
cd backend
mvn spring-boot:run
```

The backend exposes:

- `POST /api/auth/register` – register a new user (used for login as well).
- `POST /api/game/start?ai=false` – start a new game (AI placeholder when `ai=true`).
- `GET /api/game/{id}` – fetch game state.
- `POST /api/game/{id}/state` – update game state.

Data is stored in an in-memory H2 database.

## Frontend (React + Three.js)

Requirements: Node 18+ and npm.

Install dependencies and start the dev server:

```
cd frontend
npm install
npm start
```

This serves the app on [http://localhost:3000](http://localhost:3000). The board currently displays a rotating cube as a placeholder for the 3D Wall Go board. Drag-and-drop interactions can be implemented inside `src/components/Board.js`.

## Deployment

1. Build the backend jar:

```
cd backend
mvn package
```

2. Build the frontend static bundle:

```
cd frontend
npm run build
```

The generated `bundle.js` in `frontend/public` can be served by any web server (e.g., Nginx or Spring Boot static resources). For AWS deployment, you can deploy the backend jar to an EC2 instance or container service and serve the static frontend files via S3/CloudFront or from the backend itself.

The AI logic can be implemented later in `AiService.java`.

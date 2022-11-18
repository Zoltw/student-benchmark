<p align="center">
  <a href="https://github.com/polibuda-projects/student-benchmark">
    <img alt="Student Benchmark" src="https://github.com/polibuda-projects/student-benchmark/blob/5ac20aa6809c7d77e059a8fea130a61e60efe6d6/frontend/public/img/logo.svg" width="220"/>
  </a>
</p>

<h1 align="center">Student Benchmark - Frontend Branch</h1>
<br/>

## 1. Setting up development environment

### Requirements:
- [Node.js](https://nodejs.org/en/)

### Setup

1. Make sure that you have `Node.js` installed.
2. Clone the repository
```bash
git clone https://github.com/polibuda-projects/student-benchmark.git
```
1. **Change branch to `frontend`**
```bash
git checkout frontend
```

4. Change working directory to `frontend`
```bash
cd frontend
```
1. Install dependencies
```bash
npm ci
```
6. Start development server
```bash
npm start
```
7. Open `http://localhost:3000` in your browser

## 2. Committing changes

### Make sure you are on `frontend` branch
```bash
git branch
git checkout frontend
```

### Pulling from the repository
```bash
git pull
```

### Adding files
```bash
git add <file>
```

### Checking status of files
```bash
git status
```

### Committing files
```bash
git commit -m "<commit message>"
```

### Pushing to the repository
```bash
git push origin
```

## 3. Commit naming conventions
- Frontend commits should start with `f` (e.g. `f added login page`)
- Commits should be written in past tense (e.g. `f added login page` instead of `f add login page`)
- If applicable, commit message should include name of the Trello card (e.g. `f added login page <trello card name>`)

## Important notes

- ### Pull changes before pushing
- ### Do not commit to the `main` branch
- ### Make sure that you are on `frontend` branch
- ### You can commit directly from `VS Code`
- ### Make sure  you are running `npm` commands from `frontend` directory

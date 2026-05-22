# TestMu AI SDET-2 Assessment

## Objective

Build a scalable automation framework that supports:

- UI Testing
- API Testing
- Integration Testing
- CI/CD Execution
- Reporting

## Technology Stack

- Java 17
- Selenium WebDriver
- TestNG
- Rest Assured
- Maven
- Allure Reports
- GitHub Actions

## Framework Architecture

src
├── main
│   ├── java
│   │   ├── base
│   │   ├── pages
│   │   ├── utils
│   │   ├── api
│   │   └── listeners
│
└── test
├── java
│   ├── tests.ui
│   ├── tests.api
│   └── tests.integration
│
└── resources

## Planned Coverage

### UI
- Login
- Dashboard
- Form Validation
- Cross Browser Smoke

### API
- CRUD
- Authentication
- Error Handling
- Schema Validation
- Response Time Validation

### Integration
- Create data using API
- Validate through UI
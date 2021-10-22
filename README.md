# MovieProjekt
Demoprojekt brugt til deploymentundervisning med database

## Installing

### Step 1 - download project:
```
git clone git@github.com:techkea/movie-project.git && cd movie-project
```

### Step 2 - install database:
```
mysql --local-infile=1 -h 127.0.0.1 -P 3306 -u root -p < ./src/main/resources/data/movies.sql
```

### Step 3 - set properties:
```
nano ./src/main/resources/application.properties
```

### Step 4 - build:
```
mvn install
```

### Step 5 - run:
```
mvn spring-boot:run
```
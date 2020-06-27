docker build -t checkout .
docker run -d -p 8090:8080 --name checkoutservice checkout
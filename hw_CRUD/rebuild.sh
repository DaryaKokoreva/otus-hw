docker build -t daryakokoreva/usercrud  --progress=plain .
docker push daryakokoreva/usercrud
kubectl  delete -f .
kubectl  apply -f .
kubectl get pods
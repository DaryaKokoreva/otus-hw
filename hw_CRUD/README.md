Startup:

```shell
helm install -f values.yaml usercrud-db oci://registry-1.docker.io/bitnamicharts/postgresql
kubectl  apply -f .
```

Migration will be executed by application

Wait for container startup and logs output has `Started UsercrudApplication in`


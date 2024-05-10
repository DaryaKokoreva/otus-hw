Startup:

```shell
helm upgrade -f values.yaml usercrud-db oci://registry-1.docker.io/bitnamicharts/postgresql
kubectl  apply -f .
```

Wait for container startup and logs output has `Started UsercrudApplication in`


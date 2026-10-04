def tell(){
  echo "this is deploy"
  sh "docker compose up -d"
}

sudo printf "CREATE DATABASE veronica-db;" > veronica_db.sql

sudo -U postgres psql -f veronica_db.sql

echo "Running veronica_schema.sql"
sudo -U postgres psql -U postgres veronica-db < /tmp/veronica_schema.sql


echo "Running veronica_data.sql"
sudo -U postgres psql -U postgres veronica-db < /tmp/veronica_data.sql

echo "Finished Database section"

exit
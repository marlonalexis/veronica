echo "Running veronica_schema.sql"
psql -U postgres -f /tmp/veronica_schema.sql
echo "Running veronica_data.sql"
psql -U postgres -f /tmp/veronica_data.sql
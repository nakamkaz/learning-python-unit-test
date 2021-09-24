echo '{"items":[{"em0":3,"name":"hello"},{"id":44,"value":"aaabbbccc"}]}' | python3 -m json.tool > hasinf.json
# {
#    "json": [
#        {
#            "em0": 3,
#            "name": "hello"
#        }
#    ]
#}


echo '{"items":[]}' | python3 -m json.tool > empinf.json

import json

with open('hasinf.json') as fh:
        swe = json.load(fh)
        print('hasinf.json has some items')
        print('swe: \n\t',swe)
        print('swe["items"] : \n\t', swe["items"])
        print('len(swe["items"]) : ', len(swe["items"]))

        print();
with open('empinf.json') as fe:
        swe = json.load(fe)
        print('empinf.json has NO item')
        print('swe: \n\t',swe)
        print('swe["items"] : \n\t', swe["items"])
        print('len(swe["items"]) : ', len(swe["items"]))

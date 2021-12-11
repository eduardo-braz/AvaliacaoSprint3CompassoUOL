# Avaliação apresentada a avaliação da sprint 3 do Programa de Bolsas SpringBoot Compasso UOL

Requisitos:

### Desenvolva uma API REST com os seguintes endpoints:
POST - /api/states
GET - /api/states
GET - /api/states/{id}
PUT - /api/states/{id}
DELETE - /api/states/{id}

A estrutura do objeto é a seguinte:
{
  "id": "1",
  "nome": "Rio Grande do Norte",
  "regiao": "Nordeste",
  "populacao": 3409000,
  "capital": "Natal",
  "area": 52.797
}

* O id é a chave primaria e deve ser gerado automaticamente.
* O campo região só deve aceitar 5 valores: Norte, Nordeste, Sul, Sudeste e Centro-Oeste. Se
for colocado um valor diferente desses 5, não deve permitir o cadastro.
* O endpoint GET - /api/states, deve possuir os seguintes filtros:
<ol>
<li>Filtrar os estados por região</li>
<li>Filtrar os estados com maior população</li>
<li>Filtrar os estados com a maior área</li>
</ol>

**Os arquivos do projeto encontram-se na pasta [sprint3](/sprint3).**

### Faça o swagger da API desenvolvida na questão 1

Usando documentação da OpenApi: <https://swagger.io/specification/>

**O arquivo .YAML do Swagger encontra-se na pasta [swagger](/swagger), assim como o arquivo index.html gerado.**

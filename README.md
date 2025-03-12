# Bus Stop API

Microserviço Spring Boot para gerenciar pontos de embarque e desembarque de ônibus, consumindo dados GTFS de uma API pública.

## Índice
- [Visão Geral](#visão-geral)
- [Recursos](#recursos)
- [Requisitos](#requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Visão Geral
Este microserviço consome dados GTFS de uma API pública e disponibiliza endpoints RESTful para consultar pontos de parada de ônibus.

## Recursos
- Consumo periódico de dados GTFS via pooling.
- Persistência dos dados em banco de dados.
- Endpoint RESTful para consulta de pontos de parada.

## Requisitos
- Java 21+
- Maven 3.x
- Git

## Instalação
```bash

git clone https://github.com/seu-usuario/bus-stop-api.git
cd bus-stop-api
mvn clean install
```

## Uso
### Inicie o aplicativo:
```bash

mvn spring-boot:run
```
### Endpoints disponíveis:

- ``GET /api/stops: Lista`` todos os pontos de parada.

## Contribuição
Veja CONTRIBUTING.md para mais detalhes.

## Licença
Este projeto está licenciado sob a [MIT License](https://opensource.org/license/mit) .

# CarShop
Trata-se de um projeto simples para gerenciar as vendas de veículos possibilitando visualizar os carros disponíveis e seus preços, é possível deletar, criar, editar e buscar atravéz de um filtro.

**Em conceitos técnicos:**
###### JAVA Back-end
Foi construido uma API com java e Springboot, que contem a entidade carro e suas propriedades, as requisições são feitas atravez do controller GET, POST, PUT e DELETE de url: ``` api/v1/carros ``` 

###### Angular Front-end
No front foi utilizado o Angular com typescript explorando seus recursos como componentes, modulos, pipes etc.

**Requisitos:**
1. JAVA 17
2. Angular CLI 8.3.18
3. Node 12.22.9

Como utilizar: 
Va até a pasta cars-shop-api e abra um terminal dentro desse diretorio e execute:
```gradle bootRun```

em seguida dentro da pasta CarShop abra um terminal dentro desse diretorio e execute:
```npm install``` em seguida após instalar todas dependencias:
```ng serve```

Pronto agora so acessar o localhost:4200.


>Outro meio é atravéz do dockercompose, cada aplicação tem o seu dockercompose, por esse meio ele criara 2 containers rodando a aplicação

**OBS: Importante a porta 8080 e 4200 estar livre**

screenshots:

![](https://github.com/LucasCastro94/Carshop/blob/master/screenshots/scr1.png)

![](https://github.com/LucasCastro94/Carshop/blob/master/screenshots/scr3.png)

![](https://github.com/LucasCastro94/Carshop/blob/master/screenshots/scr4.png)


FROM node:12.22.12 as angular
WORKDIR /app
COPY package.json /app
RUN npm install --silent
COPY . .
RUN npm run build

FROM nginx:alpine
VOLUME /var/cache/nginx
COPY --from=angular app/dist/CarShop /usr/share/nginx/html
COPY ./config/nginx.conf /etc/ngix/conf.d/default.conf
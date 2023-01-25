FROM node:16

# Create app directory
WORKDIR /usr/src/app

# Copy the package.json and package-lock.json
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of the application
COPY . .

# Build the Angular application
RUN npm run build --prod

# Expose the port that the Angular application will run on
EXPOSE 4200

# Start the Angular development server
CMD ["npm", "start"]
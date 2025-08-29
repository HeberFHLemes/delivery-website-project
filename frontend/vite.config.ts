import { defineConfig } from 'vite';
// import viteTsconfigPaths from 'vite-tsconfig-paths';
import tailwindcss from '@tailwindcss/vite'

export default defineConfig({
    plugins: [
        // viteTsconfigPaths(),
        tailwindcss(),
    ],
    server: {
        port: 4200,
    },
    build: {
        outDir: 'dist',
    },
});
import { PublicRoutes } from "./publicRoutes/index.jsx";
import React from 'react';
import { BrowserRouter} from 'react-router-dom';

export const Routes = () => (
    
        <BrowserRouter>
                {PublicRoutes()}
        </BrowserRouter>
    
)
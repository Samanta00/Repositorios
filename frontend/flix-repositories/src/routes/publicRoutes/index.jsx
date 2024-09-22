import React from 'react';
import { Routes, Route } from 'react-router-dom';
import PageHome from '../../pages/Home/index'

export const PublicRoutes = () => {
  return (
    <Routes>
      <Route path="/" element={<PageHome />} />
    </Routes>
  );
};



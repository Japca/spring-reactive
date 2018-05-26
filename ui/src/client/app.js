import React from 'react'
import ReactDOM from 'react-dom'
import Layout from './Layout/Layout'
import Nav from './Nav/Nav'
import {BrowserRouter as Router} from 'react-router-dom'
import reset from '../../css/reset.css'

const app = document.getElementById('app')
ReactDOM.render(
    <Router>
        <div>
            <Nav/>
            <Layout/>
        </div>
    </Router>, app)

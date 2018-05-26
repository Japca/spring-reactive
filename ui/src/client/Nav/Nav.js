import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import style from './nav.css'
import CSSModules from 'react-css-modules'


export const ROOT = '/'
export const LIST = '/list'
export const DROP = '/drop'

class Nav extends Component {


    render() {
        console.log('Navigator');
        return (
            <div styleName="nav-container">
                <Link to={LIST}>List</Link>
                <Link to={DROP}>Drop</Link>
            </div>
        );
    }

}

export default CSSModules(Nav, style);





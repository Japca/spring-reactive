import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import styles from './nav.css'
import CSSModules from 'react-css-modules'


export const ROOT = '/'
export const LIST = '/list'
export const DROP = '/drop'
export const MODAL = '/modal'

@CSSModules(styles, {allowMultiple:true})
class Nav extends Component {


    render() {
        console.log('Navigator');
        return (
            <div styleName="nav-container">
                <Link to={LIST}>List</Link>
                <Link to={DROP}>Drop</Link>
                <Link to={MODAL}>Modal</Link>
            </div>
        );
    }

}

export default Nav;





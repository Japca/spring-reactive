import React, {Component} from 'react'
import Button from '@material-ui/core/Button';
import Star from '@material-ui/icons/Star';
import {withStyles} from '@material-ui/core/styles';
import PropTypes from 'prop-types';

const styles = {
    button: {
        background: 'linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)',
        borderRadius: 3,
        border: 0,
        color: 'white',
        height: 48,
        padding: '0 30px',
        boxShadow: '0 3px 5px 2px rgba(255, 105, 135, .30)',
        textTransform: 'none',
        
    },
};

Bootstrap.propTypes = {
    children: PropTypes.node,
    classes: PropTypes.object.isRequired,
};

function Bootstrap(props)  {


        return (
            <div>
                <Button className={props.classes.button}><Star/>Touch</Button>
            </div>

        )



}

export default withStyles(styles)(Bootstrap)